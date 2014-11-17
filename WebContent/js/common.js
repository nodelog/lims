jQuery(function($) {
    $(document).ready( function() {
        $('.navbar-wrapper').stickUp();//页面滚动时导航菜单置顶
        $('.navbar-header a').tooltip("hide");//导航菜单标题提示
        $('.js-logo').click(function(){
            location.reload();
        });
    });
});