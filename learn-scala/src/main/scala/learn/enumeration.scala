package learn

object enumeration {
  object ScbServiceIntegrationStatus extends Enumeration {
    type ScbServiceIntegrationStatus = Value

    val Idle: Value = Value(0)
    val Retry: Value = Value(1)
    val Complete: Value = Value(2)
  }

  def run(): Unit = {
    val status = ScbServiceIntegrationStatus.Complete
    val x = ScbServiceIntegrationStatus(1)
    val y = ScbServiceIntegrationStatus(2)
    println(status.id)
  }
}

