document.write("<script language=javascript src='../js/zm/globalUrl.js'></script>");

function getReachDeal(keyword, startTime, endTime, page, pageSize){
    var backData = null;
    var postData = {
        keyword : keyword,
        starttime : startTime,
        endtime : endTime,
        page : page,
        length : pageSize
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/reachdeal/list",
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

function addReachDeal(vid, uid, guider, bid, hostprice, price, dealprice, cid, firstcv, secondcv){
    var backData = null;
    var postData = {
        vid : vid,
        uid : uid,
        guider : guider,
        bid: bid,
        hostprice : hostprice,
        price : price,
        dealprice : dealprice,
        cid : cid,
        firstcv : firstcv,
        secondcv : secondcv
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/reachdeal/add",
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

function getReachDealFromRid(rid){
    var backData = null;
    var postData = {
        rid : rid
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/reachdeal/get",
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

