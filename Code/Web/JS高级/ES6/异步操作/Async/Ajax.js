async function Ajax(url){
    return new Promise((resolve,reject) => {
        let xhr = new XMLHttpRequest()
        xhr.open('GET',url)
        xhr.send()
        xhr.onreadystatechange = () => {
            if(xhr.readyState == 4) {
                if(xhr.status >= 200 && xhr.status < 300 || xhr.status == 304){
                    resolve(xhr.responseText)
                    console.log(xhr.responseText)
                } else {
                    reject(xhr.status)
                }
            }
        }
    })
}
async function getNews(url){
    let newUrl = await Ajax(url)
    await Ajax(newUrl)
}
let url = 'http://127.0.0.1/index/Async/Step1.txt' 
getNews(url)
