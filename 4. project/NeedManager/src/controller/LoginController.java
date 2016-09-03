package controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

/**
 *  用于登陆，首页的显示等
 * @author 刘广卫
 *
 */
public class LoginController extends Controller {
	public void index(){
		//跳转至首页，路径在config类中已经配置，这里为相对路径
		render("index.html");
	}
	
	/**
	 * 登陆方法
	 */
	public void login(){
		String userName = getPara("username");
		String password = getPara("password");
		renderText("failed");
	}
}
