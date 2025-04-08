const express = require("express")
const PORT = 5656;
const app = express();
const path = require("path");
const mongoose = require('mongoose');

mongoose.connect("").then(()=>{
    console.log("Database connection success")
}).catch(()=>{
    console.log("some error in conection")
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
// app.get("/#", (request, response)=>{
//     response.sendFile(path.join(__dirname, "public", "fourOfour.html"));
// })

app.listen(PORT, ()=>{
    console.log(`App running on Port ${PORT}`)
})
