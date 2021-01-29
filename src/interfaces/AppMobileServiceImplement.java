package interfaces;

import clases.AppMobile;

public class AppMobileServiceImplement implements IAppMobileService {

	public AppMobileServiceImplement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public AppMobile createApp() {
		
		// Atributos
		String[] permisosArray = {"Cámara", "Micrófono", "Geolocalización", "Acelerómetro", "Contactos"};
		
		AppMobile appmobile = new AppMobile(permisosArray);

		
		// Creación
		
		// TODO Auto-generated method stub
		return appmobile;
	}

}
