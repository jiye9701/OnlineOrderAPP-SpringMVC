package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

	@Autowired
	private UsersRepository usersRepository;
	
	private static int userNo;
	public int getUserNo()
	{
		return userNo;
	}
	private static String userId;
	public String getUserId()
	{
		return userId;
	}
	
	private static String password;
	public String getPassword()
	{
		return password;
	}
	
	
	@ModelAttribute("users")
	public Users users() {
		return new Users();
	}

	@RequestMapping("/index")
	public String home() {
		return "index";
	}

	@PostMapping("/regUsers")
	public @ResponseBody ModelAndView add(@RequestParam("userId") String userId,
			@RequestParam("password") String password, @RequestParam("firstname") String firstname,
			@RequestParam("lastname") String lastname, @RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("address") String address, @RequestParam("city") String city,
			@RequestParam("postalCode") String postalCode) {
		Users users = new Users(userId, password, firstname, lastname, phoneNumber, address, city,
				postalCode);
		usersRepository.save(users);
		return new ModelAndView("index");
	}

	//eidt
	@RequestMapping("/information")
//	public ModelAndView showAdmin() 
//	{
//	UsersController usersCt = new UsersController();
//	userId = usersCt.getUserId();
//	ModelAndView mv = new ModelAndView();
//	mv.addObject("users", usersRepository.findAdmin(userId, password));
//	  return mv;
//	  }
	
	public @ResponseBody ModelAndView edit(@RequestParam("userId") String userId,
			@RequestParam("password") String password) {
		List<Users> urs = usersRepository.findUser(userId, password);
		
		if (urs.isEmpty() == false) {
			Users a_users = urs.get(0);
			userNo= a_users.getUserNo();
			ModelAndView modelAndView = new ModelAndView("edit");
			return modelAndView;
		} else {
			return new ModelAndView("error");
		}
		 

	}

	@RequestMapping("/register")
	public ModelAndView Reg() {
		return new ModelAndView("register");
	}

	
	//update info

	@PostMapping("/changedUsersInfo")
	public @ResponseBody ModelAndView change(@RequestParam("userNo") int userNo,
			@RequestParam("userId") String userId, @RequestParam("password") String password,
			@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname,
			@RequestParam("phoneNumber") String phoneNumber, @RequestParam("address") String address,
			@RequestParam("city") String city, @RequestParam("postalCode") String postalCode) {
		Users users = new Users(userNo, userId, password, firstname, lastname, phoneNumber, address, city,
				postalCode);
		usersRepository.save(users);
		return new ModelAndView("edit");
	}
	
	//editPage
	
	@RequestMapping("/changeInfo")
	public ModelAndView changeInfo() {
		return new ModelAndView("changeUsersInfo");
	}

	@RequestMapping("/ordering")
	public ModelAndView ordering() {
		return new ModelAndView("order");
	}

	//after showing
	@RequestMapping("/edit2")
	public ModelAndView edit2() {
		return new ModelAndView("edit");
	}
	
	@RequestMapping("../edit2")
	public ModelAndView edit2_admin() {
		return new ModelAndView("edit");
	}



}
