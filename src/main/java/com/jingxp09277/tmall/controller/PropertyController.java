package com.jingxp09277.tmall.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jingxp09277.tmall.pojo.Category;
import com.jingxp09277.tmall.pojo.Property;
import com.jingxp09277.tmall.service.CategoryService;
import com.jingxp09277.tmall.service.PropertyService;
import com.jingxp09277.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class PropertyController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    PropertyService propertyService;

    @RequestMapping("admin_property_add")
    public String add(Model model, Property property){
        propertyService.add(property);
        return "redirect:admin_property_list?cid="+property.getCid();
    }
    @RequestMapping("admin_property_delete")
    public String delete(int id){
        Property p = propertyService.get(id);
        propertyService.delete(id);
        return "redirect:admin_property_list?cid="+p.getCid();
    }
    @RequestMapping("admin_property_edit")
    public String edit(Model model, int id){
        Property p = propertyService.get(id);
        Category c = categoryService.get(p.getId());
        p.setCategory(c);
        model.addAttribute("p",p);
        return "admin/editProperty";
    }@RequestMapping("admin_property_update")
    public String update( Property property){
        propertyService.update(property);
        return "redirect:admin_property_list?cid="+property.getCid();
    }
    @RequestMapping("admin_property_list")
    public String list(int cid,Model model,Page page){
        Category c = categoryService.get(cid);

        PageHelper.offsetPage(page.getStart(),page.getCount());
        List<Property> ps = propertyService.list(cid);

        int total = (int ) new PageInfo<>(ps).getTotal();
        page.setTotal(total);
        page.setParam("&cid="+c.getId());

        model.addAttribute("ps", ps);
        model.addAttribute("c", c);
        model.addAttribute("page", page);

        return "admin/listProperty";
    }

}
