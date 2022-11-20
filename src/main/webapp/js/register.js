//判断登录状态
{
    if (sessionStorage.getItem('id') == null) {
        location.href = "register.html";
    } else {
        console.log(sessionStorage.getItem('id'));
    }
}