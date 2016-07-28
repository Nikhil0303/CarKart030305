package com.niit.service;

import com.niit.dao.CardDetailDao;
import com.niit.model.CardDetail;
import com.niit.service.CardDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class CardDetailServiceImpl implements CardDetailService{

    @Autowired
    private CardDetailDao cardDetailDao;

    public void addCardDetail (CardDetail cardDetail) {
    	cardDetailDao.addCardDetail(cardDetail);
    }

 
}
