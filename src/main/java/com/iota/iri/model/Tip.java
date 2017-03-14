package com.iota.iri.model;

import com.iota.iri.service.tangle.annotations.*;

/**
 * Created by paul on 3/8/17 for iri.
 */
@ArrayModel
@Model
public class Tip {
    @ModelIndex public byte[] hash;
    @HasOne public byte value = 1;
}
