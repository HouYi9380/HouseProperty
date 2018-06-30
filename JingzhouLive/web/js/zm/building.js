document.write("<script language=javascript src='../js/zm/globalUrl.js'></script>");
function getBuilding(areaId, type, keyword, houseType, startPrice, endPrice, startAcreage, endAcreage, page, pageSize) {
    var backData = null;
    var postData = {
       type : type,
        areaid: areaId,
       keyword : keyword,
       houseType : houseType,
       startPrice : startPrice,
       endPrice : endPrice,
       startAcreage : startAcreage,
       endAcreage : endAcreage,
       page : page,
       length : pageSize
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/buildings/search",
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

function getBuildingFromId(bid){
    var backData = null;
    var postData = {
        bid : bid
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/buildings/currenthouse",
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

function addBuilding(building){
    var backData = null;
    var postData = {
        type : building.type,
        title : building.type,
        address : building.address,
        contacts : building.contacts,
        phone : building.phone,
        area : building.area,
        latitude : building.latitude,
        longtitude : building.longtitude,
        pics : building.pics,
        favourable : building.favourable,
        traffic : building.traffic,
        buildingInfo : building.buildingInfo,
        decoration : building.decoration,
        shared : building.shared,
        commissionId : building.commissionId,
        price : building.price,
        acreage : building.acreage,
        houseType : building.houseType,
        recommend : building.recommend,
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/buildings/add",
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

function updateBuilding(building){
    var backData = null;
    var postData = {
        bid : bid,
        type : building.type,
        title : building.title,
        address : building.address,
        contacts : building.contacts,
        phone : building.phone,
        area : building.area,
        latitude : building.latitude,
        longtitude : building.longtitude,
        pics : building.pics,
        favourable : building.favourable,
        traffic : building.traffic,
        buildingInfo : building.buildingInfo,
        decoration : building.decoration,
        shared : building.shared,
        commissionId : building.commissionId,
        price : building.price,
        acreage : building.acreage,
        houseType : building.houseType,
        recommend : building.recommend,
    }

    $.ajax({
        type: "post",
        url: globalUrl + "/buildings/update",
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