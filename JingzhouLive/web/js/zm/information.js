var globalUrl = "http://localhost:1731"

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
