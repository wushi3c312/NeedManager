package controller;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

/**
 *  ���ڵ�½����ҳ����ʾ��
 * @author ������
 *
 */
public class LoginController extends Controller {
	public void index(){
		//��ת����ҳ��·����config�����Ѿ����ã�����Ϊ���·��
		render("index.html");
	}
	
	/**
	 * ��½����
	 */
	public void login(){
		String userName = getPara("username");
		String password = getPara("password");
		renderText("failed");
	}
}
