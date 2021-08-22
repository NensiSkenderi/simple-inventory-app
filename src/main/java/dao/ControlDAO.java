package dao;

//a helper class to process all dao (data access object) classes, its easier to read and faster to work with other database classes
public class ControlDAO {

	private static ControlDAO dao = new ControlDAO();
	private static ItemsDao items_dao = new ItemsDao();
	
	public static ControlDAO getControlDao() {
		return dao;
	}
	
	//here we keep a reference to itemsDao class so we can use it whenever we want
	public ItemsDao getItemsDao() {
		return items_dao;
	}
	
	
}
