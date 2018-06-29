var globalUrl = "http://192.168.130.17:1731"
// var globalUrl = "http://192.168.130.140/jz"

function getInformationFromType(keyword, type, startTime, endTime, areaId, page, pageSize){
    var backData = null;
    var postData = {
        keyword : keyword,
        type : type,
        startTime : startTime,
        endTime : endTime,
        page : page,
        areaId : areaId,
        length : pageSize
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/information/list",
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

function getInformationFromIId(iid){
    var backData = null;
    var postData = {
        iid: iid
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/information/get",
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
