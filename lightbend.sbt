resolvers in ThisBuild += "lightbend-commercial-mvn" at
  "https://repo.lightbend.com/pass/DKKmZaxU6F22sMCgmfEhaRrIkT9HnYB66l5kjWYkhewgkwha/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
  url("https://repo.lightbend.com/pass/DKKmZaxU6F22sMCgmfEhaRrIkT9HnYB66l5kjWYkhewgkwha/commercial-releases"))(Resolver.ivyStylePatterns)