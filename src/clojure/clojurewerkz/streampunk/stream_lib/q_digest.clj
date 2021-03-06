(ns clojurewerkz.streampunk.stream-lib.q-digest
  (:import [com.clearspring.analytics.stream.quantile IQuantileEstimator QDigest]))

;;
;; API
;;

(defn q-digest
  [^double compression-factor]
  (QDigest. compression-factor))

(defn offer
  [^IQuantileEstimator algo ^long val]
  (.offer algo val))

(defn get-quantile
  ^long [^IQuantileEstimator algo ^double q]
  (.getQuantile algo q))
