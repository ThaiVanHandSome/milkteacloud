package hcmute.controller.user;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import hcmute.entity.UserEntity;
import hcmute.model.UserModel;
import hcmute.service.IUserService;

@Controller
@RequestMapping("user_infor")
public class UserInfoController {

	@Autowired
	IUserService userService;

	@GetMapping("/{user_id}")
	public String viewCustomer(ModelMap model, @PathVariable("user_id") Integer userId) {
		Optional<UserEntity> opt = userService.findById(userId);

		if (opt.isPresent()) {
			UserEntity customer = opt.get();
			model.addAttribute("customer", customer);
			return "user/user_infor";
		} else {
			model.addAttribute("message", "Không tìm thấy thông tin khách hàng với ID: " + userId);
			return "user/error"; // 
		}
	}

	@PostMapping("/saveOrUpdate/{user_id}") // chuyển hướng tới đâu đây
	public ModelAndView saveOrUpdate(ModelMap model, @PathVariable("user_id") Integer userId,
			@Valid @ModelAttribute("customer") UserModel customer, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("user/error");
		}
		if (customer != null) {
			UserEntity entity = new UserEntity();
			if (customer.getName() != null) {
				entity.setName(customer.getName());
			}
			if (customer.getSurname() != null) {
				entity.setSurname(customer.getSurname());
			}
			if (customer.getBirthday() != null) {
				entity.setBirthday(customer.getBirthday());
			}
			if (customer.getGender() ==1| customer.getGender() ==0) {
				entity.setGender(customer.getGender());
			}
			
			BeanUtils.copyProperties(customer, entity);
//			userService.save(entity);
            String message = customer.getIsEdit() ? "Customer đã được cập nhật thành công" : "Customer đã được thêm thành công";
            model.addAttribute("message", message);
        } else {
            model.addAttribute("message", "Không thể lưu Customer");
        }
		
		return new ModelAndView("forward:/user_infor/" + userId); // chuyển hướng tới đâu đây

	}
    
    @GetMapping("saveOrUpdate/{user_id}")
    public ModelAndView edit(ModelMap model, @PathVariable("user_id") Integer userId) {
        Optional<UserEntity> opt = userService.findById(userId);
        UserModel customer = new UserModel();
        if (opt.isPresent()) {
            UserEntity entity = opt.get();
            BeanUtils.copyProperties(entity, customer);
            customer.setIsEdit(true);
            model.addAttribute("customer", customer);
            return new ModelAndView("forward:/user/user_infor/"+userId, model);//chỗ này return về cái nào giờ
        }

        model.addAttribute("message", "Customer không tồn tại");
        return new ModelAndView("forward:/user/error", model); //chỗ này return về cái nào giờ
    }

	
	

}