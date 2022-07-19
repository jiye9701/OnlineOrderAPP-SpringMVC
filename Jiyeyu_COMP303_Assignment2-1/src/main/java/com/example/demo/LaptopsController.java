package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LaptopsController {

	@Autowired
	private UsersRepository usersRepository;
	@Autowired
	private LaptopsRepository laptopsRepository;
	@Autowired
	private OrdersRepository ordersRepository;
	
	
	
	static int userNo;
	

	
	@RequestMapping("/orderedLaptops")
	public @ResponseBody ModelAndView orders (@RequestParam("laptopId") int laptopId,
			@RequestParam("lsize") String lsize,
		 @RequestParam("lnum") int lnum,
			@RequestParam("amountPaid") double amountPaid) 
	{
		UsersController usersCt = new UsersController();
		userNo = usersCt.getUserNo();
		
		double totalPrice = lnum * amountPaid;
		Orders orders = new Orders(userNo, laptopId, lnum, amountPaid, lsize);
		ordersRepository.save(orders);
		
		return new ModelAndView("edit");
	}
	
	@RequestMapping("/showOrder")
	public ModelAndView showOrder() 
	{
		UsersController usersCt = new UsersController();
		userNo = usersCt.getUserNo();
		ModelAndView mv = new ModelAndView();
		mv.addObject("showOrder", ordersRepository.findOrders(userNo));
		
		return mv;
	}
	
	  @RequestMapping("/admin/showOrder")
	  public String show(Model model)
	{
	  model.addAttribute("showOrder", ordersRepository.findAll());
	  return "showOrder";
	  }
	
	
}
