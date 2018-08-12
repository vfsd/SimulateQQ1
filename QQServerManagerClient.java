package com.vfsd.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.vfsd.controller.ServerSocketManagerController;

/**
 * QQ管理端界面
 * @Date 2018-08-04
 * @author luo
 *
 */
public class QQServerManagerClient extends JFrame implements ActionListener{

	private JPanel jPanel1 = null;//定义面板
	private JButton jButtonStartServer = null;//定义启动服务按钮
	
	public QQServerManagerClient() {
		jPanel1 = new JPanel();
		jButtonStartServer = new JButton("启动服务");
		jButtonStartServer.addActionListener(this);
		
		
		jPanel1.add(jButtonStartServer);
		this.add(jPanel1);
		this.setSize(1000,560);
		this.setTitle("服务端管理界面");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==jButtonStartServer) {
			System.out.println("启动服务");
			new ServerSocketManagerController();
		}
	}
	
	public static void main(String[] args) {
		QQServerManagerClient qqServerManagerClient = new QQServerManagerClient();
	}

}
