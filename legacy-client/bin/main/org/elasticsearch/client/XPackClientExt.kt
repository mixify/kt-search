// Generated by EsKotlinCodeGenPlugin.
//
// Do not modify. This code is regenerated regularly. 
package org.elasticsearch.client

import com.jillesvangurp.eskotlinwrapper.SuspendingActionListener.Companion.suspending
import org.elasticsearch.client.xpack.XPackInfoRequest
import org.elasticsearch.client.xpack.XPackInfoResponse
import org.elasticsearch.client.xpack.XPackUsageRequest
import org.elasticsearch.client.xpack.XPackUsageResponse

public suspend fun XPackClient.infoAsync(request: XPackInfoRequest, requestOptions: RequestOptions =
    RequestOptions.DEFAULT): XPackInfoResponse {
  // generated code block
  return suspending {
      this.infoAsync(request,requestOptions,it)
  }
}

public suspend fun XPackClient.usageAsync(request: XPackUsageRequest, requestOptions: RequestOptions
    = RequestOptions.DEFAULT): XPackUsageResponse {
  // generated code block
  return suspending {
      this.usageAsync(request,requestOptions,it)
  }
}