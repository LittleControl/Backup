let btns = document.getElementsByTagName('button')
btn1 = btns[0]
btn1.onclick = () =>{
    getTest('http://127.0.0.1/index/promise/Nothing.txt')
}
function getTest(url) {
    let promise = new Promise((resolve, reject) => {
        let xmlHttp = new XMLHttpRequest()
        xmlHttp.onreadystatechange = () => {
            if (xmlHttp.readyState == 4) {
                if (xmlHttp.status >= 200 && xmlHttp.status < 300 || xmlHttp.status == 304) {
                    resolve(xmlHttp.responseText)
                } else {
                    reject(xmlHttp.status)
                }
            }
        }
        xmlHttp.open('GET', url)
        xmlHttp.send()
    }
    )
    promise
        .then((data) => {
            console.log(data)
            return getTest(data)
        }, (error) => {
            // alert(error)
            console.log(error)
            alert('Nothing can be continuedly founded!')
        })
}
