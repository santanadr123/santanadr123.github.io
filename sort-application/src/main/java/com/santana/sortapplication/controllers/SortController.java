package com.santana.sortapplication.controllers;

import com.santana.sortapplication.models.SelectionSort;
import com.santana.sortapplication.models.SortModel;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class SortController {

    SortModel randomNumbers;
    SelectionSort selectionSort;
    ArrayList<Integer> list;
    Integer selection;

    @GetMapping("/")
    public String index(Model model, HttpServletRequest request){
        List<Integer> array = Arrays.asList(5,10,15,20);
        randomNumbers = new SortModel();
        model.addAttribute("array", array);
        if(request.getParameter("selectedSize") == null){
            selection = array.get(0);
        }else{
            selection = Integer.valueOf(request.getParameter("selectedSize") );
        }
        list = randomNumbers.listOfNumbers(selection);
        model.addAttribute("list", list);
        return "index";
    }


    @PostMapping ("/")
    public String getArray(SortModel randomNumbers, Model model){
        List array = Arrays.asList(5,10,15,20);
        model.addAttribute("array", array);
        selectionSort = new SelectionSort();
        ArrayList<Integer> sortedList = selectionSort.selectionSort(list);
        model.addAttribute("list", sortedList);
        return "index";
    }

}
