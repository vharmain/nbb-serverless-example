(ns example
  (:require [applied-science.js-interop :as j]))

(defn handler [event _ctx]
  (let [body (js/JSON.parse (j/get event :body))
        x    (j/get body :x)
        y    (j/get body :y)]
    (js/Promise.resolve
     (clj->js
      {:statusCode 200
       :body       (js/JSON.stringify #js{:result (+ x y)})}))))

;; exports
#js {:handler handler}
