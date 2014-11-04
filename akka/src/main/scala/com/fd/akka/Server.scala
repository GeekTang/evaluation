package com.fd.akka
import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.actor.ActorLogging
import com.typesafe.config.ConfigFactory

class SLR extends Actor with ActorLogging {
  def receive = {
    case Greeting(who) => {
      Thread.sleep(1000)
      log.info("Hello " + who)
      sender ! "OK!"
    }
  }
}

object HelloRemote extends App {
  val system = ActorSystem("RemoteSystem",ConfigFactory.load("server-application.conf"))
  val remoteActor = system.actorOf(Props[SLR], name = "SLR")
  remoteActor ! Greeting("Sonny Rollins")
  println("Finish greeting operation.")
}