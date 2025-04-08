const express = require('express');
const PORT = 5656;
const app = express();
const path = require("path");
const mongoose = require('mongoose');
app.use(express.urlencoded({extended:true}))
mongoose.connect("mongodb+srv://piebytwo014:piebytwo014@cluster0.iw0d6qp.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0").then(()=>{
    console.log("Database connection success")
}).catch((err)=>{
    console.log("some error in connection ", err) 
})

app.get("/", (request, response)=>{
    response.sendFile(path.join(__dirname, "public", "homePage.html"));
})
app.get("/login", (request, response)=>{
    response.sendFile(path.join(__dirname, "public", "loginPage.html"));
})
app.get("/register", (request, response)=>{
    response.sendFile(path.join(__dirname, "public", "registerPage.html"));
})
app.post("/create-user", (request, response)=>{
    console.log("Register Called")
    console.log(request.body)
})
app.post("/login-user", (request, response)=>{
    console.log("Login Called")
})
// app.get("/#", (request, response)=>{
//     response.sendFile(path.join(__dirname, "public", "fourOfour.html"));
// })

app.listen(PORT, ()=>{
    console.log(`App running on Port ${PORT}`)
})
