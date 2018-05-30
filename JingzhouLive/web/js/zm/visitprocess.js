var globalUrl = "http://localhost:1731"

function getVisitProcess(ischeck, keyword, startTime, endTime, page, pageSize){
    var backData = null;
    var postData = {
        ischeck : ischeck,
        keyword : keyword,
        startTime : startTime,
        endTime : endTime,
        page : page,
        length : pageSize
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/visitprocess/list",
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

function getVisitProcessFromIId(vid){
    var backData = null;
    var postData = {
        vid: vid
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/visitprocess/get",
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


function  updateInformation(information) {
    var backData = null;
    var postData = {
        iid : information.iid,
        title: information.title,
        type : information.type,
        pics : information.pics,
        html : information.html,
        areaid: "027"
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/information/edit",
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

function addInformation(information){
    var backData = null;
    var postData = {
        title: information.title,
        type : information.type,
        pics : information.pics,
        html : information.html,
        areaid : "027"
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/information/add",
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