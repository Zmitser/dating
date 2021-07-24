package by.zmitser.dating.profile

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("by.zmitser.dating.profile")
		.start()
}

