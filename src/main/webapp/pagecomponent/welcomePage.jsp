<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--*****************************快捷方式页面********************************-->
<script>
$(function(){
	quickAccessInit();
})
// 快捷方式
function quickAccessInit(){
    <!--为class为shortcut绑定上点击事件-->
	$('.shortcut').click(function(){
		var title = $(this).find('.title').text();
		var url = $('.menu_item:contains('+ title + ')').attr('name');
		$('#panel').load(url);
	})
}
</script>
				<!-- 整一个欢迎界面div -->
				<div class="panel panel-default">
					<!-- 面包屑（主页） -->
					<ol class="breadcrumb">
						<li>主页</li>
					</ol>

					<div class="panel-body">
						<div class="row" style="margin-top: 100px; margin-bottom: 100px">
							<div class="col-md-1"></div>
							<div class="col-md-10" style="text-align: center">
								<!--库存查询div-->
								<div class="col-md-4 col-sm-4">
									<a href="javascript:void(0)" class="thumbnail shortcut"> <img
										src="media/icons/hosekeepp1.svg" alt="库存查询"
										class="img-rounded link" style="width: 150px; height: 150px;">
										<div class="caption">
											<h3 class="title">打扫卫生</h3>
										</div>
									</a>
								</div>
								<!--货物入库div-->
								<div class="col-md-4 col-sm-4">
									<a href="javascript:void(0)" class="thumbnail shortcut"> <img
										src="media/icons/hosekeepp2.svg" alt="货物入库"
										class="img-rounded link" style="width: 150px; height: 150px;">
										<div class="caption">
											<h3 class="title">保姆服务</h3>
										</div>
									</a>
								</div>
								<!--货物出库div-->
								<div class="col-md-4 col-sm-4">
									<a href="javascript:void(0)" class="thumbnail shortcut"> <img
										src="media/icons/hosekeepp3.svg" alt="货物出库"
										class="img-rounded link" style="width: 150px; height: 150px;">
										<div class="caption">
											<h3 class="title">月嫂服务</h3>
										</div>
									</a>
								</div>
							</div>
							<div class="col-md-1"></div>
						</div>
					</div>
				</div>
