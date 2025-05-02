const nodemailer = require('nodemailer');
const jwt = require('jsonwebtoken');
const JWT_PASSWORD = "this_is_top_secret"
const sendEmail = (email, userName)=>{



    const mailTransport = nodemailer.createTransport({
        service:"gmail",
        auth:{
            user:"test.duck.mail@gmail.com",
            pass:"lpykkdjeycrxieud"
        }
    })

    // const verificationCode = `12${email}34`
    const verificationCode = jwt.sign({email}, JWT_PASSWORD, {expiresIn:"5m"})

    const verificationLink = `http://localhost:5656/verify-email?code=${verificationCode}`

    const mailToSend = ({
        from:"test.duck.mail@gmail.com",
        to:email,
        subject:"Verification Mail From MCA Dept.",
        html:`<p>Hi ${userName},</p>
                <br>
            <p>Your account has been created successfully</p>
            <br>
            <p>Please use the link below to verify your account</p>
            <br>
            <a href=${verificationLink}>${verificationLink}</a>
            <br>
            <p>Thanks & Regards</p>
            <br>
            <p>MCA Department</p>

        `
    })


    mailTransport.sendMail(mailToSend, (err)=>{
        if(err){
            console.log("Mail sent failure")
        }else{
            console.log("Mail sent Success")
        }
    })
}

const verification = (recToken)=>{
    try {
       const bag=  jwt.verify(recToken, JWT_PASSWORD);
       const emailAdd = bag.email;
       console.log(emailAdd);
       console.log("Verification Success")
    } catch (error) {
        if(jwt.TokenExpiredError){
            console.log("Token Expired")
        }else{
            console.log("Verfication Failed")
        }
    }
}



module.exports={sendEmail, verification};