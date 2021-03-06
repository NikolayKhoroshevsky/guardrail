package com.twilio.guardrail.protocol.terms.protocol

import _root_.io.swagger.models.ArrayModel
import com.twilio.guardrail.generators.GeneratorSettings
import com.twilio.guardrail.languages.LA

sealed trait ArrayProtocolTerm[L <: LA, T]
case class ExtractArrayType[L <: LA](arr: ArrayModel, concreteTypes: List[PropMeta]) extends ArrayProtocolTerm[L, L#Type]
