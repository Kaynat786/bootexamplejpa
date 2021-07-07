package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context =SpringApplication.run(BootjpaexampleApplication.class, args);
			UserRepository userRepository=context.getBean(UserRepository.class);
			
			/*//single saving
			 * User user=new User(); user.setName("afroz"); user.setCity("Balrampur");
			 * user.setStatus("I am C++ developer"); User user1=userRepository.save(user);
			 */
			
			/* multiple data save
			 * User user=new User(); user.setName("afroz"); user.setCity("Balrampur");
			 * user.setStatus("I am C++ developer");
			 * 
			 * 
			 * User user1=new User(); user1.setName("Faisal"); user1.setCity("Mau");
			 * user1.setStatus("I a UI developer");
			 * 
			 * List<User> useres=List.of(user,user1); Iterable<User> result=
			 * userRepository.saveAll(useres);
			 * 
			 * result.forEach(users->{
			 * 
			 * System.out.println(users);
			 * 
			 * });
			 */
			
			//update the user 11
			
			/*
			 * Optional<User> optional = userRepository.findById(11); User user =
			 * optional.get(); user.setStatus("I am UI Developer"); User result =
			 * userRepository.save(user); System.out.println(result);
			 * System.out.println("Done");
			 */
			
			//fetching data
			
			  Iterable<User> itr = userRepository.findAll(); 
			  /*Iterator<User> iterator =
			 itr.iterator(); while(iterator.hasNext()) { User user = iterator.next();
			 * System.out.println(user); }
			 */
			
//			itr.forEach(new Consumer<User>() {
//				@Override
//				public void accept(User t)
//				{
//					System.out.println(t);
//				}
//			});
			  
			  //deleting the single user data
				/*
				 * userRepository.deleteById(11); System.out.println("deleted");
				 */
				//itr.forEach(user->System.out.println(user));
			 // multiple delete
			  	//userRepository.deleteAll(itr);
				
			  
             //custom find
				/*
				 * List<User> username = userRepository.findByName("kaynat");
				 * username.forEach(e->System.out.println(e));
				 */
			  List<User> findAll = userRepository.findAll();
			  findAll.forEach(ent->{
				  System.out.println(ent);
			  });
	}
	
	
}
