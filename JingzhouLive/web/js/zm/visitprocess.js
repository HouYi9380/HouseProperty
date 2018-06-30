document.write("<script language=javascript src='../js/zm/globalUrl.js'></script>");

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

function getVisitProcessFromVid(vid){
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


function  checkVisitProcess(isCheck, vid, mark) {
    var backData = null;
    var postData = {
        vid : vid,
        ischeck : isCheck,
        mark : mark
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/visitprocess/check",
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

