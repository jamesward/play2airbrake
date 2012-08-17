import play.api.GlobalSettings
import play.api.mvc.RequestHeader
import play.airbrake.Airbrake
import play.api.Play.current

object Global extends GlobalSettings {

  override def onError(request: RequestHeader, ex: Throwable) = {
    Airbrake.notify(request, ex)
    super.onError(request, ex)
  }

}