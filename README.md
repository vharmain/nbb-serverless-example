# nbb serverless example

This example demonstrates how to deploy and run CLJS code on AWS Lambda NodeJS 14.x runtime using [Serverless Framework](https://www.serverless.com/).

We setup a simple HTTP POST endpoint on API Gateway that proxies requests to a lambda function. `index.mjs` file works as a bootstrap that uses [nbb](https://github.com/babashka/nbb/) to load CLJS code when the lambda (cold)starts.

## Prerequisities

* AWS Account and API credentials configured on your system
* Node

## Setup, deployment and testing

* `npm install`
* `npx sls deploy`

Grab the endpoint URL from the output and call it like this:

```shell
curl -X POST -H "Content-Type: application/json" -d '{"x":1,"y":2}' https://1xz3t07x70.execute-api.us-east-1.amazonaws.com/dev/add
```

## Develop

You can edit the code locally or directly in the Lambda Console.
