const nodemailer = require('nodemailer');

const sendEmail = ()=>{
    const mailTransport = nodemailer.createTransport({
        service:"gmail",
        auth:{
            user:"test.duck.mail@gmail.com",
            pass:"lpykkdjeycrxieud"
        }
    })

    const mailToSend = ({
        from:"test.duck.mail@gmail.com",
        to:"fibijo5330@f5url.com",
        subject:"Verification Mail From MCA Dept.",
        text:"this is a test email from auth app"
    })

    mailTransport.sendMail(mailToSend, (err)=>{
        if(err){
            console.log("Mail sent failure")
        }else{
            console.log("Mail sent Success")
        }
    })
}

sendEmail();