package io.prediction.core

import io.prediction.{ 
  BaseActual, 
  BaseFeature, 
  BasePrediction,
  BaseEvaluationUnit }

// Below are internal classes used by PIO workflow
trait BasePersistentData {}

trait BaseEvaluationSeq extends BasePersistentData {}

trait BasePredictionSeq extends BasePersistentData {}

trait BaseEvaluationUnitSeq extends BasePersistentData {}

class EvaluationSeq[F <: BaseFeature, A <: BaseActual](
  val data: Seq[(F, A)]) extends BaseEvaluationSeq {}

class PredictionSeq[F <: BaseFeature, P <: BasePrediction, A <: BaseActual](
  val data: Seq[(F, P, A)]) extends BasePredictionSeq {}

class EvaluationUnitSeq[EU <: BaseEvaluationUnit](
  val data: Seq[EU]) extends BaseEvaluationUnitSeq {}
