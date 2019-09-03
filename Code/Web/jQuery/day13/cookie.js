function addCookie(cookie) {
    var date = new Date()
    date.setDate(date.getDate() + 7)
    cookie.expires = cookie.expires || date.toUTCString()
    cookie.path = cookie.path || '/'
    cookie.domain = cookie.domain || defaultDomain()
    document.cookie = cookie.key + '=' + cookie.value + ';expires=' + cookie.expires + ';path=' + cookie.path +
        ';domain=' + cookie.domain + ';'
}

function findCookie(key) {
    var cookie = document.cookie.split(';')  
    for(let i = 0; i < cookie.length; i++){
        temp = cookie[i].trim().split('=')
        if(temp[0] == key){
            break;
        }
        if(i == cookie.length-1 && temp[0] != key){
            temp[1] = 'Nothing can be founded!'
        }
    }
    return temp[1]
}

function delCookie(key,path) {
    addCookie({
        key: key,
        path:path || '/',
        expires: new Date(1)
    })
}

function defaultDomain() {
    domain = window.location.pathname
    var tag = domain.indexOf('/')
    domain = domain.slice(0, tag)
    return domain
}