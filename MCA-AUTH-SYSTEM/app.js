const express = require('express');
const PORT = 5656;
const app = express();
const path = require("path");
const mongoose = require('mongoose');
const sendEmail = require('./service/sendMail');
app.use(express.urlencoded({extended:true}))
mongoose.connect("mongodb+srv://piebytwo014:piebytwo014@cluster0.iw0d6qp.mongodb.net/user_auth?retryWrites=true&w=majority&appName=Cluster0").then(()=>{
    console.log("Database connection success")
}).catch((err)=>{
    console.log("some error in connection ", err) 
})

const userSchema = mongoose.Schema({
    firstName:String,
    lastName:String,
    email:String,
    Phone:String, 
    password:String,
    isVerified:Boolean
})

const userModel = mongoose.model('user', userSchema);

app.get("/", (request, response)=>{
      response.sendFile(path.join(__dirname, "public", "homePage.html"));
})
app.get("/login", (request, response)=>{
    response.sendFile(path.join(__dirname, "public", "loginPage.html"));
})
app.get("/register", (request, response)=>{
    response.sendFile(path.join(__dirname, "public", "registerPage.html"));
})
app.post("/create-user",async (request, response)=>{
const {firstName, lastName, phoneno, email, password_0, password_1} = request.body;
const exist = await userModel.findOne({email:email});
    if(exist){
        console.log("EMail already exist")
    }else{
        try {
            const user = await userModel({
                firstName:firstName,
                lastName:lastName,
                email:email,
                Phone:phoneno, 
                password:password_0,
                isVerified:false
            })
        await user.save();
        console.log("User created Successfully")
        sendEmail(email, firstName);
        } catch (error) {
            console.log("Error in Registration ", error)
        }  
    }
})
app.post("/login-user", async(request, response)=>{
    const {email, password, } = request.body;
    const loginUser = await userModel.findOne({email:email});
        if(loginUser){
            if(loginUser.password == password && loginUser.isVerified == true){
                console.log("Login Success")
            } else if(loginUser.password == password && loginUser.isVerified == false){
                console.log("Plese Verify your account")
            }
            else if(loginUser.password != password){
                console.log("The password is incorrect")
            }
        }else{
            console.log("No user found")
        }
})
app.get("/verify-email", (request, response)=>{
   console.log("Code rec")
   const code_b = request.query.code;
})

app.listen(PORT, ()=>{
    console.log(`App running on Port ${PORT}`)
})
