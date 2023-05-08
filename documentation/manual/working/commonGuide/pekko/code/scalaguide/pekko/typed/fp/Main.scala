/*
 * Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package scalaguide.pekko.typed.fp

// #main
import org.apache.pekko.actor.typed.ActorRef
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton final class Main @Inject() (
    val helloActor: ActorRef[HelloActor.SayHello],
    val configuredActor: ActorRef[ConfiguredActor.GetConfig],
)
// #main
