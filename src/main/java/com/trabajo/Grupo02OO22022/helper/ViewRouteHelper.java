package com.trabajo.Grupo02OO22022.helper;

public class ViewRouteHelper {

    /**** Views ****/
	//HOME
    public final static String LISTAR = "/views/users/listar";
    public final static String CREAR = "/views/users/frmCrear";
	
	//USER
    public final static String LOGIN = "/user/login";

    //ROLES
    public final static String LISTAR_ROLES = "/views/roles/listar";
    public final static String CREAR_ROLES = "/views/roles/frmCrear";
 
	// /**** Redirects ****/
    public final static String HOME_ROOT = "/home";
    public final static String REDIRECT_CLIENTE = "redirect:/views/users/";
    public final static String REDIRECT_ROLE = "redirect:/views/roles/";

   
}
