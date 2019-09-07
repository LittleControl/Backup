function Ajax(url){
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
function* getNews(url){
    let newUrl = yield Ajax(url).then((data) => {
        gn.next(data)
    })
    yield Ajax(newUrl)
}
let url = 'http://127.0.0.1/index/Generator/Step1.txt' 
let gn = getNews(url)
gn.next()

