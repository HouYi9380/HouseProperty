function login(phone, pwd) {
    var postData = {
        phone: phone,
        pwd : pwd
    }

    // testSession()

    $.ajax({
        type: "post",
        url: "http://localhost:1731/managers/login",
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
            if(res != true){
                alert(msg);
                return;
            }
            window.localStorage.setItem("user", JSON.stringify(array[0]));
            window.location.href = "/html/index.html";
//                        var mid = null;
//                        var phone = null;
//                        var power = null;
//                        var name = null;
//                        var nick = null;
//                        var pics = null;
//                        var positon = null;
//
//                        for(var i in array) { // 数组
//                            alert("mid:" + array[i].mid)
//                            mid = array[i].mid;
//                            phone= array[i].phone;
//                            power = array[i].power;
//                            name = array[i].name;
//                            nick = array[i].nick;
//                            pics = array[i].pics;
//                            positon = array[i].positon;
//                        }
//                        if(mid == null || mid == ""){
//                            alert("登陆失败");
//                        }else{
//                            var ref = "/html/index.html?mid=" + mid;
//                            alert("phone=" + phone);
//                            alert("power=" + power);
//                            if(phone != null)
//                                ref = ref + "&phone=" + phone;
//                            if(power != null)
//                                 ref = ref  + "&power=" + power;
//                            if(name != null)
//                                ref = ref + "&name=" + name;
//                            if(nick != null)
//                                ref = ref + "&nick=" + nick;
//                            if(pics != null)
//                                ref = ref + "&pics=" + pics;
//                            if(positon != null)
//                                ref = ref + "&positon=" + positon;
        },
        error : function () {
            alert("登陆失败");
        }
    });

    // function testSession(){
    //     $.ajax({
    //         type: "post",
    //         url: "http://localhost:1731/session/login",
    //         data: postData,
    //         datatype: "json",
    //         //添加跨域
    //         async: false,
    //         xhrFields: {
    //             withCredentials: true
    //         },
    //         crossDomain: true,
    //         success: function (data) {
    //             alert(data);
    //         }
    //     })
    //
    //     $.ajax({
    //         type: "post",
    //         url: "http://localhost:1731/session/getSession",
    //         data: postData,
    //         datatype: "json",
    //         //添加跨域
    //         async: false,
    //         xhrFields: {
    //             withCredentials: true
    //         },
    //         crossDomain: true,
    //         success: function (data) {
    //             alert(data);
    //         }
    //     })

    // }
}