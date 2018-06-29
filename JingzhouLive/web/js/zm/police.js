var globalUrl = "http://192.168.130.17:1731"
// var globalUrl = "http://192.168.130.140/jz"

function getPolices(page, pageSize) {
    var backData = null;
    var postData = {
        page : page,
        length : pageSize
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/commissionpolicy/list",
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

function getPoliceFromId(cpid) {
    var backData = null;
    var postData = {
        cpid : cpid
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/commissionpolicy/get",
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

function updatePolice(police) {
    var backData = null;
    var postData = {
        cid : police.cpid,
        title : police.title,
        type : police.type,
        firstcv : police.firstcv,
        secondcv : police.secondcv,
        content : police.content
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/commissionpolicy/update",
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

function addPolice(police) {
    var backData = null;
    var postData = {
        title : police.title,
        type : police.type,
        firstcv : police.firstcv,
        secondcv : police.secondcv,
        content : police.content
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/commissionpolicy/add",
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

function invalidPolice(cid) {
    var backData = null;
    var postData = {
        cid : cid
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/commissionpolicy/delete",
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
