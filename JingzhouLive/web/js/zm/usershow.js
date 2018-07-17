window.onload = function () {
    // alert("user show!!");

    var userJson = window.localStorage.getItem("user");
    if (userJson == null) {
        alert("user error!");
        return;
    }
    var user = JSON.parse(userJson);
    if (user == null) {
        alert("user error!");
        return;
    }
    var uid = user.uid;
    var power = user.power;
    var phone = user.phone;
    var name = user.name;
    var positon = user.positon;
    var img = user.pics;

    var leftheaddiv = '<div class="media logged-user"> \
                <img alt="" src=' + img + '  class="media-object"> \
                <div class="media-body"> \
                <h4><a id="userid" href="#">' + name + '</a></h4> \
                <span id = "userpower">"' + positon + '"</span> \
                </div> \
                </div> \
                <h5 class="left-nav-title">Account Information</h5> \
                <ul class="nav nav-pills nav-stacked custom-nav"> \
                <li><a href="/html/login.html"><i class="fa fa-sign-out"></i> <span>登出</span></a></li> \
                </ul>';
    var rightheaddiv = '<ul class="notification-menu"> \
               <li> \
               <a href="#" class="btn btn-default dropdown-toggle" data-toggle="dropdown"> \
                <img src=' + img + ' alt="" /> '
        + name + '  ' + positon +

        '<span class="caret"></span> \
        </a> \
        <ul class="dropdown-menu dropdown-menu-usermenu pull-right"> \
        <li><a href="/html/login.html"><i class="fa fa-sign-out"></i> 登出</a></li>  \
        </ul> \
        </li> \
        </ul>';
    $("#leftheaddiv").html(leftheaddiv);
    $("#rightHeadDiv").html(rightheaddiv);

}