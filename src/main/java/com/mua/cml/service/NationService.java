package com.mua.cml.service;

import com.mua.cml.model.CmlNation;
import org.springframework.stereotype.Service;

/**
 * Created by King on 2017/7/17.
 */
@Service
public interface NationService {
    int insert(CmlNation cmlNation);

    int updNation(String nationName, String nationDesc, String nationPic);
}
