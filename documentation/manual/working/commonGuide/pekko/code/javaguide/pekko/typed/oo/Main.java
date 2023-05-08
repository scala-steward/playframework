/*
 * Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package javaguide.pekko.typed.oo;

// #main
import org.apache.pekko.actor.typed.ActorRef;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public final class Main {
  public final ActorRef<HelloActor.SayHello> helloActor;
  public final ActorRef<ConfiguredActor.GetConfig> configuredActor;

  @Inject
  public Main(
      ActorRef<HelloActor.SayHello> helloActor,
      ActorRef<ConfiguredActor.GetConfig> configuredActor) {
    this.helloActor = helloActor;
    this.configuredActor = configuredActor;
  }
}
// #main
