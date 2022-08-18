package com.example.hmilytccinventory.controller;


import com.example.hmilytccinventory.service.IInventoryService;
import com.example.hmilytccinventory.service.impl.InventoryServiceImpl;
import com.newland.inventory.dto.InventoryDTO;
import org.dromara.hmily.spring.utils.SpringBeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author leellun
 * @since 2022-08-17
 */
@RestController
@RequestMapping("/inventory")
public class InventoryController {
    private final IInventoryService inventoryService;

    @Autowired
    public InventoryController(IInventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @RequestMapping("/decrease")
    public Boolean decrease(@RequestBody InventoryDTO inventoryDTO) {
        return inventoryService.decrease(inventoryDTO);
    }

    @RequestMapping("/testDecrease")
    public Boolean testDecrease(@RequestBody InventoryDTO inventoryDTO) {
        return inventoryService.testDecrease(inventoryDTO);
    }

    @RequestMapping("/findByProductId")
    public Integer findByProductId(@RequestParam("productId") String productId) {
        return inventoryService.findByProductId(productId).getTotalInventory();
    }

    @RequestMapping("/mockWithTryException")
    public Boolean mockWithTryException(@RequestBody InventoryDTO inventoryDTO) {
        return inventoryService.mockWithTryException(inventoryDTO);
    }

    @RequestMapping("/mockWithTryTimeout")
    public Boolean mockWithTryTimeout(@RequestBody InventoryDTO inventoryDTO) {
        return inventoryService.mockWithTryTimeout(inventoryDTO);
    }
}

