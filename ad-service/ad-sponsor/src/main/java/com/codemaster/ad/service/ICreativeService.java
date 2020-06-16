package com.codemaster.ad.service;

import com.codemaster.ad.vo.CreativeRequest;
import com.codemaster.ad.vo.CreativeResponse;

public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
