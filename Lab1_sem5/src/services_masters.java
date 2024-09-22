/*
public class services_masters {
	
public static void main(String[] args){
		Object service = new Object(){
			
			String name = "Маникюр";
			
			String price = "1300 руб.";
			
			String time = "90 минут";
			
			void printInfo(){
				System.out.println("Название услуги: " + name);
				System.out.println("Стоимость: " + price);
				System.out.println("Продолжительность: " + time);
				
			}
		};
	}
	
	System.out.println("Информация о услуге: ");
	service.getClass().getDeclaredMethods()[0].setAccessible(true);
	true{
		service.getClass().getDeclaredMethods()[0].invoke(service);
	}catch (Exception e){
		e.printStackTrace();
	}
	System.out.println();
	
	Object master = new Object(){
		
		String F_name = "Светлана";
			
		String post = "Мастерка маникюра";
			
		String tel = "+7 (000) 000-00-00";
			
		void printInfo_m(){
			System.out.println("Имя мастера: " + name);
			System.out.println("Должность: " + post);
			System.out.println("Телефон: " + tel);
		
		}
		System.out.println("Информация о мастере: ");
		master.getClass().getDeclaredMethods()[0].setAccessible(true);
		true{
			master.getClass().getDeclaredMethods()[0].invoke(service);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
*/



public class services_masters {
    public interface Service {
        void displayInfo();
    }

    public interface Master {
        void displayInfo();
    }

    public static void main(String[] args) {
        
    	Service service = new Service() {
            String name = "Маникюр";
            String price = "1300 руб";
            String time = "90 минут"; 

            
            public void displayInfo() {
                System.out.println("Название услуги: " + name);
                System.out.println("Должность: " + price);
                System.out.println("Продолжительность: " + time);
                
            }
        };

        
        Master master = new Master() {
            String name = "Светлана";
            String post = "Мастерка маникюра";
            String phone = "+7-000-000-00-00";

            
            public void displayInfo() {
                System.out.println("Информация о мастере:");
                System.out.println("Имя мастера: " + name);
                System.out.println("Должность: " + post);
                System.out.println("Телефон: " + phone);
            }
        };

       
        service.displayInfo();
        System.out.println();
        master.displayInfo();
    }
}
