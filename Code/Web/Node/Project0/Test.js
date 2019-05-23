var st=require('./studnets')
st.find(function(err,data){
    if(err){
        res.status(500).send("Server Error !")
    }
    console.log(JSON.parse(data).commits)    
});