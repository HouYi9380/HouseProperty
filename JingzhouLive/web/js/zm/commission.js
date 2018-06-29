// var globalUrl = "http://192.168.130.140/jz"
var globalUrl = "http://192.168.130.10:1731"

function getCommissionProcess(progress, keyword, startTime, endTime, page, pageSize){
    var backData = null;
    var postData = {
        progress : progress,
        keyword : keyword,
        startTime : startTime,
        endTime : endTime,
        page : page,
        length : pageSize
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/commissionprocess/list",
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