package com.fd.akka

import akka.actor.ActorSystem
import akka.actor.Props
import com.typesafe.config.ConfigFactory
import akka.actor.ActorLogging
import akka.actor.Actor

class Notify extends Actor with ActorLogging {
  def receive = {
    case msg: String => {
      log.info("Get notification " + msg)
    }
  }
}

object HelloClient extends App {
  val system = ActorSystem("ClientSystem",ConfigFactory.load("client-application.conf"))
  val greeter = system.actorFor("akka.tcp://RemoteSystem@127.0.0.1:7155/user/SLR")
  val notifyActor = system.actorOf(Props[Notify], name = "Notify")
  greeter.tell(Greeting("Remote FD"), notifyActor)
}