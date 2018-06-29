var globalUrl = "http://192.168.130.17:1731"
// var globalUrl = "http://192.168.130.140/jz"

function login(phone, pwd) {
    var postData = {
        phone: phone,
        pwd: pwd
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/managers/login",
        data: postData,
        datatype: "json",
        //添加跨域
        async: false,
        xhrFields: {
            withCredentials: true
        },
        crossDomain: true,
        success: function (data) {
            var jsonData = JSON.parse(data);
            var res = jsonData.res;
            var msg = jsonData.msg;
            var array = jsonData.data;
            if (res != true) {
                alert(msg);
                return;
            }
            window.localStorage.setItem("user", JSON.stringify(array[0]));
            window.location.href = "/html/index.html";
        },
        error: function () {
            alert("登陆失败");
        }
    });
}

/**
 * 文件上传，上传完成后需提交用户信息
 * @param file
 */
function uploadHeadImgAjax(mid, phone, power, positon, name, file){
    var formfile=new FormData();
    formfile.append("file",file);
    var data=formfile;

    $.ajax({
        url:globalUrl + "/upload/file",
        data:data,
        type:"Post",
        dataType:"json",
        cache:false,
        processData:false,
        contentType:false,
        success:function(result){
            var jsonData = JSON.parse(result);
            var res = jsonData.res;
            var msg = jsonData.msg;
            var array = jsonData.data;
            if(res != true){
                alert(msg);
                return;
            }
            alert("data[0]" + array[0])
            modefyUser(mid, phone, power, positon, array[0])
        },
        error: function () {
            alert("error");
        }
    });



}
function modefyManager(mid, phone, power, name, position, headImg){
    alert("modefyUser 未做")
}

function modefyManagerPwdAjax(prePwd, newPwd){
    var postData = {
        prepwd: prePwd,
        newpwd:newPwd
    }
    $.ajax({
        type: "post",
        url: globalUrl + "/managers/changepwd",
        data: postData,
        datatype: "json",
        //添加跨域
        async: false,
        xhrFields: {
            withCredentials: true
        },
        crossDomain: true,
        success: function (data) {
            var jsonData = JSON.parse(data);
            var res = jsonData.res;
            var msg = jsonData.msg;
            // var array = jsonData.data;
            if (res != true) {
                alert(msg);
                return;
            }
            alert(msg)
        },
        error: function () {
            alert("服务异常");
        }
    })
}

function getManagerList(keyword, page, pageSize){
    var backData = null;
    var postData = {
       keyword : keyword,
        page : page,
        length : pageSize
    }
    $.ajax({
        type: "post",
        url: globalUrl + "/managers/list",
        data: postData,
        datatype: "json",
        //添加跨域
        async: false,
        xhrFields: {
            withCredentials: true
        },
        crossDomain: true,
        success: function (data) {
            var jsonData = JSON.parse(data);
            var res = jsonData.res;
            var msg = jsonData.msg;
            var array = jsonData.data;
            if (res != true) {
                alert(msg);
                return;
            }
            // alert(msg)
            console.log("array.firstPage:" + array[0].firstPage)
            console.log("array.firstPage:" + array[0].lastPage)
            console.log("array.firstPage:" + array[0].total)
            backData = array;
        },
        error: function () {
            alert("服务异常");
            return;
        }
    })
    return backData
}

function addManager(phone, name, position){
    var backData = null;
    var postData = {
        phone: phone,
        name: name,
        power: 2,
        positon : position
    }
    $.ajax({
        type: "post",
        url: globalUrl + "/managers/add",
        data: postData,
        datatype: "json",
        //添加跨域
        async: false,
        xhrFields: {
            withCredentials: true
        },
        crossDomain: true,
        success: function (data) {
            var jsonData = JSON.parse(data);
            backData = jsonData;
        },
        error: function () {
            alert("服务异常");
            return;
        }
    })
    return backData
}

function getManagerFromLocal(){
    var userJson = window.localStorage.getItem("user");
    if(userJson == null){
        alert("user error!");
        return null;
    }
    var  user = JSON.parse(userJson);
    return user;
}

//===============================user========================================

function getUsers(keyword, registType, startTime, endTime, page, pageSize){
    var backData = null;
    var postData = {
        keyword: keyword,
        registType: registType,
        startTime: startTime,
        endTime: endTime,
        page : page,
        length : pageSize
    }
    $.ajax({
        type: "post",
        url: globalUrl + "/user/userlist",
        data: postData,
        datatype: "json",
        //添加跨域
        async: false,
        xhrFields: {
            withCredentials: true
        },
        crossDomain: true,
        success: function (data) {
            var jsonData = JSON.parse(data);
            backData = jsonData;
        },
        error: function () {
            alert("服务异常");
            return;
        }
    })
    return backData
}

